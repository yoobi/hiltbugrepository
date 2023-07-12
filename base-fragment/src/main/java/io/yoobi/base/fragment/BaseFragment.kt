package io.yoobi.base.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import io.yoobi.analytics.AnalyticsRepository
import javax.inject.Inject

abstract class BaseFragment: Fragment() {

    @Inject internal lateinit var analytics: AnalyticsRepository

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        analytics.sendLog("onViewCreated ${this::class.java.simpleName}")
    }
}
