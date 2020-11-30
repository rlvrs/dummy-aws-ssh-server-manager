package dev.santos.awssshservermanager.repository

import dev.santos.awssshservermanager.model.HostGroup
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HostGroupRepository : JpaRepository<HostGroup, Long> {
}