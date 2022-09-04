package com.example.cardscarrousel.cardCarrousel.presentation.cardCarrousel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.cardscarrousel.base.BaseFragment
import com.example.cardscarrousel.cardCarrousel.presentation.models.CardCarrouselPresentation
import com.example.cardscarrousel.databinding.FragmentCardCarrouselBinding

class CardCarrouselFragment : BaseFragment<FragmentCardCarrouselBinding, CardCarrouselViewModel>(){

    override val viewModel by viewModels<CardCarrouselViewModel> ()
    private lateinit var itemsCarrousel : List<CardCarrouselPresentation>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getCardCarrouselList()
    }

    override fun inflateView(
        inflater: LayoutInflater,
        container: ViewGroup?
    )= FragmentCardCarrouselBinding.inflate(inflater, container, false)

    override fun observe() {
        viewModel.event.observe(viewLifecycleOwner){ event ->
            when (event) {
                is CardCarrouselEvent.ListCardCarrousel -> {
                    itemsCarrousel = event.ls_carrousel
                   // setupCarousel()
                }
            }
        }
    }

}