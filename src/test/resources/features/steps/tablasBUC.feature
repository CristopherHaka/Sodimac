@tablasBUC
Feature: Probar Modelo E-R de BUC

  @ExistenObjBD
  Scenario Outline: Verifico que existan los objetos de datos
    When Consulto si existe la tabla <nametable>
    Then valido que el objeto exista en BD

    Examples: 
      | nametable             |
      | "customer"            |
      | "lov"                 |
      | "audit_trail"         |
      | "contact"             |
      | "contact_method"      |
      | "customer_identifier" |
      | "economy_activity"    |
      | "economy_type"        |
      | "hierarchy_address"   |
      | "address"             |

  @ExistenRegTablasMaestras
  Scenario Outline: Verifico Tablas Maestras con datos cargados
    When realizo consulta de la tabla maestra <nametable>
    Then valido que tenga registros

    Examples: 
      | nametable           |
      | "economy_activity"  |
      | "lov"               |
      | "hierarchy_address" |

  @VerificoPKUnicos
  Scenario Outline: Verifico que no se repitan PK en las tablas
    When realizo consulta de PK la tabla  <nametable>
    Then valido que no tenga campos PK repetidos.

    Examples: 
      | nametable  |
      | "customer" |

  @VerificoCamposObligatoriosNotNull
  Scenario Outline: Verifico que en las tablas los campos obligatorios sean distintos de null
    When realizo consulta de la tabla <nametable>
    Then valido que los campos obligatorios tengas valores

    Examples: 
      | nametable             |
      | "customer"            |
      | "lov"                 |
      | "audit_trail"         |
      | "contact"             |
      | "contact_method"      |
      | "customer_identifier" |
      | "economy_activity"    |
      | "economy_type"        |
      | "hierarchy_address"   |
      | "address"             |

  @VerificoNivelesDirecciones
  Scenario: Verifico que en la tabla address el arreglo tenga los niveles de la relaccion hierarchy_address
    When realizo consulta de la tabla address y hierarchy_address
    Then valido que el arreglo address tenga los niveles indicados en la tabla hierarchy_address

  @VerificoFKTablas
  Scenario Outline: Verifico que los FK de la tablas existan en las tablas primarias
    When realizo consulta del campo FK en la tabla <nametable>
    And realizo consulta del PK en las tablas primarias
    Then valido que el campo FK  se encuentre en el campo PK de las tablas primarias

    Examples: 
      | nametable             |
      | "contact"             |
      | "contact_method"      |
      | "customer_identifier" |
      | "economy_type"        |
      | "address"             |

  @VerificoConsultaClientes
  Scenario Outline: Verifico consulta de clientes
    When realizo consulta de clientes pasando los filtros <country><type><value>
    Then valido que devuelva los datos a mostrar en la vista

    Examples: 
      | country | type | value |
      | ""      | ""   | ""    |

  @VerificoConsultaContacto
  Scenario Outline: Verifico consulta de contactos
    When realizo consulta de contacto de clientes pasando los filtros <country><type><value>
    Then valido que devuelva los datos a mostrar en la vista

    Examples: 
      | country | type | value |
      | ""      | ""   | ""    |

  @VerificoConsultaDirecciones
  Scenario Outline: Verifico consulta de direcciones
    When realizo consulta de direcciones de clientes pasando los filtros <country><type><value>
    Then valido que devuelva los datos a mostrar en la vista

    Examples: 
      | country | type | value |
      | ""      | ""   | ""    |

  @VerificoConsultaContact_Method
  Scenario Outline: Verifico consulta de contact_method
    When realizo consulta de contact_method pasando los filtros <country><type><value>
    Then valido que devuelva los datos a mostrar en la vista

    Examples: 
      | country | type | value |
      | ""      | ""   | ""    |

  @VerificoConsultaEconomy_Type_Activity
  Scenario Outline: Verifico consulta de economy_type_activity
    When realizo consulta de contact_method pasando los filtros <country><type><value>
    Then valido que devuelva los datos a mostrar en la vista

    Examples: 
      | country | type | value |
      | ""      | ""   | ""    |
