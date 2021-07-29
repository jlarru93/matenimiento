package pe.com.banbif.mantenimiento.builder;

import java.util.List;
import java.util.Map;

import io.swagger.model.GetTagsCorreosResponse;
import io.swagger.model.TagCorreo;

public class GetTagCorreoResponseBuilder {
	
	public static GetTagCorreoResponseBuilder getInstace() {
		return new GetTagCorreoResponseBuilder();
	}
	
	public GetTagsCorreosResponse build(Map<String, String> headers, List<TagCorreo> tags) {
		GetTagsCorreosResponse response = new GetTagsCorreosResponse();
		response.setDatos(tags);
		response.setMeta(MetadatoServicioBuilder.getInstace().buildMeta(headers, tags.size()));
		return response;
	}
	
}
