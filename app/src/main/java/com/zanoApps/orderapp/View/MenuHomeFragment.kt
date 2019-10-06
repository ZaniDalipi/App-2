package com.zanoApps.orderapp.View


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.google.android.material.card.MaterialCardView

import com.zanoApps.orderapp.R
import kotlinx.android.synthetic.main.fragment_menu_home.*

/**
 * A simple [Fragment] subclass.
 */
class MenuHomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        animateElementsInsideTheLayout()


        val moreOnDrinks = view.findViewById<Button>(R.id.moreDrinks)
        moreOnDrinks.setOnClickListener {
            findNavController().navigate(R.id.action_homeMenu_dest_to_drinksCategory_dest)
        }

        val moreOnSalads = view.findViewById<Button>(R.id.moreSalads)
        moreOnSalads.setOnClickListener {
            findNavController().navigate(R.id.action_homeMenu_dest_to_saladCategory_dest)
        }

    }

    private fun animateElementsInsideTheLayout(){
        /*declare the animations*/
        val translateTopToBottom = AnimationUtils.loadAnimation(context, R.anim.top_into_bottom)
        val scaleIn = AnimationUtils.loadAnimation(context, R.anim.scale_in)
        val tBottomToTopShortDelay = AnimationUtils.loadAnimation(context, R.anim.translate_bottom_top_short_delay)
        val tBottomToTopMediumDelay = AnimationUtils.loadAnimation(context, R.anim.translate_bottom_top_medium_delay)
        val tBottomToTopLongDelay = AnimationUtils.loadAnimation(context, R.anim.translate_bottom_top_long_delay)

        /*set the animation*/
        card1.startAnimation(tBottomToTopShortDelay)
        card2.startAnimation(tBottomToTopMediumDelay)
        card3.startAnimation(tBottomToTopLongDelay)
        card4.startAnimation(tBottomToTopShortDelay)
        card5.startAnimation(tBottomToTopMediumDelay)
        card6.startAnimation(tBottomToTopLongDelay)
        card7.startAnimation(tBottomToTopShortDelay)
        card8.startAnimation(tBottomToTopMediumDelay)
        card9.startAnimation(tBottomToTopLongDelay)
        moreDrinks.startAnimation(scaleIn)
        moreSalads.startAnimation(scaleIn)
        moreChicken.startAnimation(scaleIn)
        moreMeat.startAnimation(scaleIn)
        drinks_text_view.startAnimation(translateTopToBottom)
        salad_text_view.startAnimation(translateTopToBottom)
        chicken_text_view.startAnimation(translateTopToBottom)
        meat_text_view.startAnimation(translateTopToBottom)
    }
}
