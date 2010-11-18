package sicover

class Reporte {
    Date fecha
    Date dateCreated
    Date lastUpdated
    String motivo
    String lugar
    String nombreRonda

    static constraints = {
        fecha()
        motivo blank:false
        lugar blank:false
        nombreRonda blank:false
    }
}
