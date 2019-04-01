**Templates**

Existem 5 templates de envio de e-mail mapeados, cada um deles tem seu set de variáveis para ser enviada, segue relação abaixo: 

* SUCCESS_SCHEDULLING_SAVED_SAVINGS:
    ```json
        {
            "customerName": "John Doe",
            "originAccount": "001-00",
            "destinyAccount": "003-00",
            "value": "U$ 450,00",
            "frequency": "DAILY"
        }
    ```
* SUCESS_EXECUTING_SCHEDULED_SAVINGS
    ```json
        {
            "customerName": "John Doe",
            "originAccount": "001-00",
            "destinyAccount": "003-00",
            "value": "U$ 450,00",
            "datetime": "10/05/2019 10:00:23"
        }
    ```
    
* SCHEDULED_SAVINGS_PARTIAL_LACK_OF_FUNDS
    ```json
        {
            "customerName": "John Doe",
            "originAccount": "001-00",
            "destinyAccount": "003-00",
            "value": "U$ 450,00",
            "datetime": "10/05/2019 10:00:23"
        }
    ```
    
* SCHEDULED_SAVINGS_ERROR_LACK_OF_FUNDS
    ```json
        {
            "customerName": "John Doe",
            "originAccount": "001-00",
            "destinyAccount": "003-00",
            "value": "U$ 450,00",
            "datetime": "10/05/2019 10:00:23"
        }
    ```
 
* SUCCESS_SCHEDULLING_ROUNDING_SAVINGS:
    ```json
        {
            "customerName": "John Doe",
            "originAccount": "001-00",
            "destinyAccount": "003-00",
            "value": "U$ 450,00",
            "frequency": "DAILY"
        }
    ```