import grails.plugins.springsecurity.Secured

class ControlPanelController {

    @Secured(['ROLE_FACEBOOK']) 
    def index = {
        render "Olá! Se você está vendo essa mensagem é porque fez o login pelo facebook!"
    }

}
