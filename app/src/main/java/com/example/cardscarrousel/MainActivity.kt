package com.example.cardscarrousel

import android.view.LayoutInflater
import androidx.navigation.findNavController
import com.example.cardscarrousel.base.BaseActivity
import com.example.cardscarrousel.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateView(inflater: LayoutInflater) =
        ActivityMainBinding.inflate(inflater)

    override fun setUI() {
        binding.navHostFragment.findNavController()
            .setGraph(R.navigation.navigation)
    }
}