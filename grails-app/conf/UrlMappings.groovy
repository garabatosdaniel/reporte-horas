class UrlMappings {

    static mappings = {
		"/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }

        		"/"(view:"asistencia/index")
        		"500"(view:'/error')
"/"(controller: "asistencia", action: "asistencia")
    }
    
}
