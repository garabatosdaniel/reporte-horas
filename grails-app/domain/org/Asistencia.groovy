package org

class Asistencia {
    int id
    Date fecha	
    String responsable	
    int horaEntrada	
    int horaSalida	
    int horas	
    String actividad
    
    static constraints = {
    }
        static mappings = {
      table 'ASISTENCIA'
      fecha column: 'FECHA'
      horaEntrada column: 'HORA_ENTRADA'
      horaSalida column: 'HORA_SALIDA'
      horas column: 'HORAS'
      actividad column: 'ACTIVIDAD'

      id (generator:'sequence', params:[sequence:'SEQ_ASISITENCIA'])
    }
        
}
