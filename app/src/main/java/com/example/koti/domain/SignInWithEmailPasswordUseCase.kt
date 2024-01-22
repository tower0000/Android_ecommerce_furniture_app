package com.example.koti.domain

import com.example.koti.domain.repository.FirebaseRepository
import com.google.firebase.auth.FirebaseUser
import javax.inject.Inject

class SignInWithEmailPasswordUseCase @Inject constructor (val repository: FirebaseRepository) {
    suspend fun execute(email: String , password: String): String {
        return repository.signInWithEmailPassword(email, password)
    }
}