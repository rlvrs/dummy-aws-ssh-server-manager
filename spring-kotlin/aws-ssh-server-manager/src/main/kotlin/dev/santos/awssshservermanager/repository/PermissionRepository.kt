package dev.santos.awssshservermanager.repository

import dev.santos.awssshservermanager.model.Permission
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PermissionRepository : JpaRepository<Permission, Long> {
}
