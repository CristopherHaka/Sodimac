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
      | "public"      | "AUDIT_TRAIL"      |
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
      | "AUDIT_ID"            | "AUDIT_TRAIL"      |
      | "CONTACT_ID"          | "CONTACT"          |
      | "ID"                  | "CONTACT_METHOD"   |
      | "ECONOMY_ACTIVITY_ID" | "ECONOMY_ACTIVITY" |
      | "ADDRESS_ID"          | "ADDRESS"          |

  @VerificoFKseanPKEnTablas
  Scenario Outline: Verifico que los FK de la tablas existan en las tablas primarias
    When realizo consulta del campo FK<nombreFK> en la tabla<nametable>
    Then valido que el campo FK sea PK en la tabla primaria

    @VerificoFK
    Examples: Validar FK sean PK en la tablas BUC
      | nombreFK      | nametable     |
      | "CUSTOMER_ID" | "ADDRESSpoii" |
      
  #@VerificoCamposObligatoriosNotNull
  #Scenario Outline: Verifico que en las tablas los campos obligatorios sean distintos de null
    #When realizo consulta de la table<nametable>
    #Then valido que los campos sean obligatorios
#
    #Examples: 
      #| nametable             |
      #| "customer"            |
      #| "lov"                 |
      #| "audit_trail"         |
      #| "contact"             |
      #| "contact_method"      |
      #| "customer_identifier" |
      #| "economy_activity"    |
      #| "economy_type"        |
      #| "hierarchy_address"   |
      #| "address"             |
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
