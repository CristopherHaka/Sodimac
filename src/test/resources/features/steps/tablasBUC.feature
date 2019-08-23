Feature: Probar Modelo E-R de BUC

  @ExistenTodasTablasBDBUC
  Scenario Outline: Verifico que existan las tablas en BD
    When Consulto si existe en el esquema<nombreEsquema> la tabla<nombreTabla>
    Then valido que la tabla exista en BD

    @ExistenTablas
    Examples: Validar que existan tablas en la BD BUC
      | nombreEsquema | nombreTabla        |
      | "public"      | "CUSTOMER"         |
      | "public"      | "LOV"              |
      | "public"      | "TRANSACTION_LOG"  |
      | "public"      | "CONTACT"          |
      | "public"      | "CONTACT_METHOD"   |
      | "public"      | "ECONOMY_ACTIVITY" |
      | "public"      | "ECONOMY_TYPE"     |
      | "public"      | "ADDRESS"          |

  @VerificarTodasTablasTenganPK
  Scenario Outline: Verifico PK en las tablas
    When realizo consulta de la PK<nombrePK> en la tabla<nametable>
    Then valido constraint PK

    @VerificoPK
    Examples: Validar Existen PK de la BD BUC
      | nombrePK              | nametable          |
      | "CUSTOMER_ID"         | "CUSTOMER"         |
      | "LOV_ID"              | "LOV"              |
      | "CONTACT_ID"          | "CONTACT"          |
      | "CONTACT_METHOD_ID"   | "CONTACT_METHOD"   |
      | "ECONOMY_ACTIVITY_ID" | "ECONOMY_ACTIVITY" |
      | "ADDRESS_ID"          | "ADDRESS"          |
      | "AUDIT_ID"            | "TRANSACTION_LOG"  |
      | "ECONOMY_ACTIVITY_ID" | "ECONOMY_TYPE"     |
      | "CUSTOMER_ID"         | "ECONOMY_TYPE"     |

  @VerificoFKseanPKEnTablas
  Scenario Outline: Verifico que los FK de la tablas existan en las tablas primarias
    When realizo consulta del campo FK<nombreFK> en la tabla<nametable>
    Then valido que el campo FK sea PK en la tabla primaria

    @VerificoFK
    Examples: Validar FK sean PK en la tablas BUC
      | nombreFK              | nametable        |
      | "CUSTOMER_ID"         | "ADDRESS"        |
      | "CUSTOMER_ID"         | "CONTACT_METHOD" |
      | "CONTACT_ID"          | "CONTACT_METHOD" |
      | "CUSTOMER_ID"         | "CONTACT"        |
      | "FK_PARENT_ID"        | "LOV"            |
      | "ECONOMY_ACTIVITY_ID" | "ECONOMY_TYPE"   |
      | "CUSTOMER_ID"         | "ECONOMY_TYPE"   |

  @VerificoCamposObligatoriosNotNull
  Scenario Outline: Verifico Campos Obligatorios en las tabla
    When realizo consulta de campo<nombreCampo> en la table<nametable>
    Then valido que el campo sea obligatorio

    @VerificoCamposObligatoriosCustomer
    Examples: Validar Campos Obligatorios de la tabla Customer
      | nombreCampo           | nametable  |
      | "CUSTOMER_ID"         | "CUSTOMER" |
      | "NAME"                | "CUSTOMER" |
      | "CUSTOMER_TYPE"       | "CUSTOMER" |
      | "QUALITY"             | "CUSTOMER" |
      | "SOURCE_REGISTRATION" | "CUSTOMER" |
      | "ACTIVE"              | "CUSTOMER" |
      | "COUNTRY"             | "CUSTOMER" |
      | "IDENTIFIER_TYPE"     | "CUSTOMER" |
      | "IDENTIFIER_VALUE"    | "CUSTOMER" |
      | "IDENTIFIER_COUNTRY"  | "CUSTOMER" |
      | "CREATION_DATE"       | "CUSTOMER" |

    @VerificoCamposObligatoriosAddress
    Examples: Validar Campos Obligatorios de la tabla Address
      | nombreCampo               | nametable |
      | "ADDRESS_ID"              | "ADDRESS" |
      | "CUSTOMER_ID"             | "ADDRESS" |
      | "STREET"                  | "ADDRESS" |
      | "CREATED_DATE"            | "ADDRESS" |
      | "ADMINISTRATIVE_AREA"     | "ADDRESS" |
      | "SUB_ADMINISTRATIVE_AREA" | "ADDRESS" |
      | "LOCALITY"                | "ADDRESS" |
      | "ACTIVE"                  | "ADDRESS" |
      | "ADDRESS_TYPE"            | "ADDRESS" |

    @VerificoCamposObligatoriosContact
    Examples: Validar Campos Obligatorios de la tabla Contact
      | nombreCampo        | nametable |
      | "CONTACT_ID"       | "CONTACT" |
      | "CUSTOMER_ID"      | "CONTACT" |
      | "NAME"             | "CONTACT" |
      | "SURNAME"          | "CONTACT" |
      | "IDENTIFIER_TYPE"  | "CONTACT" |
      | "IDENTIFIER_VALUE" | "CONTACT" |
      | "ACTIVE"           | "CONTACT" |
      | "CREATION_DATE"    | "CONTACT" |

    @VerificoCamposObligatoriosContact_Method
    Examples: Validar Campos Obligatorios de la tabla Contact_Method
      | nombreCampo                | nametable        |
      | "CONTACT_METHOD_ID"        | "CONTACT_METHOD" |
      | "CUSTOMER_ID"              | "CONTACT_METHOD" |
      | "TYPE"                     | "CONTACT_METHOD" |
      | "VALUE"                    | "CONTACT_METHOD" |
      | "PRINCIPAL_CONTACT_METHOD" | "CONTACT_METHOD" |
      | "ACTIVE"                   | "CONTACT_METHOD" |
      | "CREATION_DATE"            | "CONTACT_METHOD" |
      

    @VerificoCamposObligatoriosLov
    Examples: Validar Campos Obligatorios de la tabla Lov
      | nombreCampo | nametable |
      | "LOV_ID"    | "LOV"     |
      | "TYPE"      | "LOV"     |
      | "KEY"       | "LOV"     |
      | "VALUE"     | "LOV"     |

    @VerificoCamposObligatoriosTransaction_Log
    Examples: Validar Campos Obligatorios de la tabla Transaction_Log
      | nombreCampo     | nametable         |
      | "AUDIT_ID"      | "TRANSACTION_LOG" |
      | "VALUE"         | "TRANSACTION_LOG" |
      | "CREATION_DATE" | "TRANSACTION_LOG" |
      | "STATUS"        | "TRANSACTION_LOG" |

    @VerificoCamposObligatoriosEconomy_Activity
    Examples: Validar Campos Obligatorios de la tabla Economy_Activity
      | nombreCampo             | nametable          |
      | "ECONOMY_ACTIVITY_ID"   | "ECONOMY_ACTIVITY" |
      | "ECONOMY_ACTIVITY_CODE" | "ECONOMY_ACTIVITY" |
      | "TYPE"                  | "ECONOMY_ACTIVITY" |
      | "COUNTRY"               | "ECONOMY_ACTIVITY" |

    @VerificoCamposObligatoriosEconomy_Type
    Examples: Validar Campos Obligatorios de la tabla Economy_Type
      | nombreCampo                  | nametable      |
      | "ECONOMY_ACTIVITY_ID"        | "ECONOMY_TYPE" |
      | "CUSTOMER_ID"                | "ECONOMY_TYPE" |
      | "PRINCIPAL_ECONOMY_ACTIVITY" | "ECONOMY_TYPE" |
      | "ACTIVE"                     | "ECONOMY_TYPE" |
      | "CREATION_DATE"              | "ECONOMY_TYPE" |
  #@ExistenRegTablasMaestras
  #Scenario Outline: Verifico Tablas Maestras con datos cargados
    #When realizo consulta de la tabla maestra <nametable>
    #Then valido que tenga registros
#
    #Examples: 
      #| nametable           |
      #| "economy_activity"  |
      #| "lov"               |
      #| "hierarchy_address" |
#
  #@VerificoNivelesDirecciones
  #Scenario: Verifico que en la tabla address el arreglo tenga los niveles de la relaccion hierarchy_address
    #When realizo consulta de la tabla address y hierarchy_address
    #Then valido que el arreglo address tenga los niveles indicados en la tabla hierarchy_address
#
  #@VerificoConsultaClientes
  #Scenario Outline: Verifico consulta de clientes
    #When realizo consulta de clientes pasando los filtros <country><type><value>
    #Then valido que devuelva los datos a mostrar en la vista
#
    #Examples: 
      #| country | type | value |
      #| ""      | ""   | ""    |
#
  #@VerificoConsultaContacto
  #Scenario Outline: Verifico consulta de contactos
    #When realizo consulta de contacto de clientes pasando los filtros <country><type><value>
    #Then valido que devuelva los datos a mostrar en la vista
#
    #Examples: 
      #| country | type | value |
      #| ""      | ""   | ""    |
#
  #@VerificoConsultaDirecciones
  #Scenario Outline: Verifico consulta de direcciones
    #When realizo consulta de direcciones de clientes pasando los filtros <country><type><value>
    #Then valido que devuelva los datos a mostrar en la vista
#
    #Examples: 
      #| country | type | value |
      #| ""      | ""   | ""    |
#
  #@VerificoConsultaContact_Method
  #Scenario Outline: Verifico consulta de contact_method
    #When realizo consulta de contact_method pasando los filtros <country><type><value>
    #Then valido que devuelva los datos a mostrar en la vista
#
    #Examples: 
      #| country | type | value |
      #| ""      | ""   | ""    |
#
  #@VerificoConsultaEconomy_Type_Activity
  #Scenario Outline: Verifico consulta de economy_type_activity
    #When realizo consulta de contact_method pasando los filtros <country><type><value>
    #Then valido que devuelva los datos a mostrar en la vista
#
    #Examples: 
      #| country | type | value |
      #| ""      | ""   | ""    |
