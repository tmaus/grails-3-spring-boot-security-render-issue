import org.springframework.security.access.annotation.Secured

/**
 * Created by tmaus on 14/8/15.
 */
class PrivateController {

    @Secured("ROLE_USER")
    def index(){

    }
}
