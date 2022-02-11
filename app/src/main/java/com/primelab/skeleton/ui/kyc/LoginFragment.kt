package com.primelab.skeleton.ui.kyc

import android.os.Bundle
import android.view.View
import com.primelab.common.extensions.viewBinding
import com.primelab.common.logger.Log
import com.primelab.common.ui.BaseFragment
import com.primelab.skeleton.R
import com.primelab.skeleton.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by m.imran
 * Senior Software Engineer at
 * PrimeLab.io on 10/02/2022.
 */
@AndroidEntryPoint
class LoginFragment : BaseFragment(R.layout.fragment_login) {
    private val binding by viewBinding(FragmentLoginBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(">>>Login", "${binding.title.text}")
    }
}