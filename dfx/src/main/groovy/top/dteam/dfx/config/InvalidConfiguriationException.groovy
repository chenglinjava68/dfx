package top.dteam.dfx.config

import groovy.transform.CompileStatic

@CompileStatic
class InvalidConfiguriationException extends RuntimeException {

    InvalidConfiguriationException(String error) {
        super(error)
    }
}
