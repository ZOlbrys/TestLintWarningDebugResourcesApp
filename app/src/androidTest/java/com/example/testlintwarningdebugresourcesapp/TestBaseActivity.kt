package com.example.testlintwarningdebugresourcesapp

import com.example.testlintwarningdebugresourcesapp.databinding.ActivityTestBinding

class TestBaseActivity : BaseActivity<ActivityTestBinding>() {
    override fun inflateViewBinding(): ActivityTestBinding {
        return ActivityTestBinding.inflate(layoutInflater)
    }
}
