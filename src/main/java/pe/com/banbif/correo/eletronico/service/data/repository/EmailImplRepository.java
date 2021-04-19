package pe.com.banbif.correo.eletronico.service.data.repository;

import io.swagger.model.Destinatario;
import io.swagger.model.Remetente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.com.banbif.correo.eletronico.service.data.entity.Email;
import pe.com.banbif.correo.eletronico.service.models.TemplateCorreoDto;
import pe.com.banbif.correo.eletronico.service.models.TiposCorreosDto;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailImplRepository {

    private final EntityManager entityManager;

    @Autowired
    public EmailImplRepository(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional()
    public TemplateCorreoDto obtenerPlantilla(String tipoPlantilla) {
        TemplateCorreoDto templateCorreoDto = null;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("dbo.STP_GET_PLANTILLA_CORREO");

        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);


        storedProcedureQuery.setParameter(1, tipoPlantilla);

        List<Object[]> resultList = storedProcedureQuery.getResultList();

        for(Object[] objeto: resultList){
            templateCorreoDto = new TemplateCorreoDto();
            templateCorreoDto.setContenido((String) objeto[4]);
            templateCorreoDto.setAsunto((String) objeto[3]);
            Remetente remitente = new Remetente();
            remitente.setEnderecoCorreo((String) objeto[5]);
            templateCorreoDto.setRemetente(remitente);
            Destinatario destinatario = new Destinatario();
            destinatario.setEnderecoCorreo((String) objeto[6]);
            templateCorreoDto.setDestinatario(destinatario);

            templateCorreoDto.setTipoCorreo(TiposCorreosDto.fromValue((String) objeto[2]));
        }

        return templateCorreoDto;
    }

    @Transactional()
    public boolean guardarCorreo(Email email) {
        boolean responseGuardar = false;
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("dbo.STP_INS_CORREO");

        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);

        storedProcedureQuery.setParameter(1, email.getFrom());
        storedProcedureQuery.setParameter(2, email.getTo());
        storedProcedureQuery.setParameter(3, email.getBcc());
        storedProcedureQuery.setParameter(4, email.getSubject());
        storedProcedureQuery.setParameter(5, email.getTemplateCorreo());
        storedProcedureQuery.setParameter(6, email.getTemplate().getValue());

        storedProcedureQuery.executeUpdate();

        responseGuardar = true;

        return responseGuardar;
    }

    @Transactional()
    public List<Email> obtenerCorreos() {
        List<Email> listaEmail = new ArrayList<>();
        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("dbo.STP_GET_CORREO");

        List<Object[]> resultList = storedProcedureQuery.getResultList();

        for(Object[] objeto: resultList){
            Email emailDto = new Email();
            emailDto.setId((BigInteger) objeto[0]);
            emailDto.setFrom((String) objeto[1]);
            emailDto.setTo((String) objeto[2]);
            emailDto.setBcc((String) objeto[3]);
            emailDto.setSubject((String) objeto[4]);
            emailDto.setTemplateCorreo((String) objeto[5]);
            emailDto.setTemplate(TiposCorreosDto.fromValue((String) objeto[6]));

            listaEmail.add(emailDto);
        }

        return listaEmail;
    }
}
