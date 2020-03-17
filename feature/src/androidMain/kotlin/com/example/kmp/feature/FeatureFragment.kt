package com.example.kmp.feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class FeatureFragment : Fragment() {

    @Inject
    lateinit var featureDependency: FeatureDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragment = inflater.inflate(R.layout.fragment_feature, container, false)
        val textView = fragment.findViewById<TextView>(R.id.text_feature)
        textView.text = featureDependency.getText()
        return fragment
    }
}
