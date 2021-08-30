package net.xkern.passenger.data.repository

import net.xkern.passenger.data.local.db.AppDbHelper
import net.xkern.passenger.data.local.prefs.AppPreferences
import net.xkern.passenger.data.remote.ApiInterface
import javax.inject.Inject

class UserRepository @Inject constructor(
    val api: ApiInterface,
    val appPreferences: AppPreferences,
    val appDbHelper: AppDbHelper,
) {
}