package com.study.pokedex.ui.page.home

//data class HomeUiState(
//    val name: String
//)

sealed class UiState

data object LoadingUiState : UiState()

data class LoadedUiState<T>(
    val data: T
): UiState()

data class ErrorUiState(
    val message: String
): UiState()
