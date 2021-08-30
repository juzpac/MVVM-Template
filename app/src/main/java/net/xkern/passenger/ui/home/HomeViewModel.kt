package net.xkern.passenger.ui.home

import dagger.hilt.android.lifecycle.HiltViewModel
import net.xkern.passenger.data.repository.UserRepository
import net.xkern.passenger.ui.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val userRepository: UserRepository,
) : BaseViewModel() {


}