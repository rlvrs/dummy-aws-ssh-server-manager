package dev.santos.awssshservermanager.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.CONFLICT)
class DuplicateUserException(override val message: String) : RuntimeException()
@ResponseStatus(code = HttpStatus.NOT_FOUND)
class UserTenantNotFoundException(override val message: String) : RuntimeException()