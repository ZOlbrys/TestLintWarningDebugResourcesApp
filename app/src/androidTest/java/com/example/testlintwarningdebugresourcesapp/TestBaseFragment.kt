package com.example.testlintwarningdebugresourcesapp

import android.view.LayoutInflater
import com.example.testlintwarningdebugresourcesapp.databinding.FragmentTestBinding

class TestBaseFragment : BaseFragment<FragmentTestBinding>() {
    override fun inflateViewBinding(layoutInflater: LayoutInflater): FragmentTestBinding {
        return FragmentTestBinding.inflate(layoutInflater)
    }
}