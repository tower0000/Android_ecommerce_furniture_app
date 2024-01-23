package com.example.koti.domain

import com.example.koti.domain.repository.FirebaseRepository
import javax.inject.Inject

class SignOutUseCase @Inject constructor (private val repo: FirebaseRepository) {
    suspend fun execute() = repo.signOut()
}