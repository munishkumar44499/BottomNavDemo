package com.wmk.bottomnavdemo.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.wmk.bottomnavdemo.databinding.FragmentDashboardBinding
import com.wmk.bottomnavdemo.ui.comment.CommentFragment
import com.wmk.bottomnavdemo.ui.like.LikeFragment

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        Log.e("========", "============DashBoradFragment")
        binding.btnLike.setOnClickListener {
            childFragmentManager.beginTransaction().add(LikeFragment.newInstance("",""),"likeFragment").commitAllowingStateLoss()
        }
        binding.btnComment.setOnClickListener {
            childFragmentManager.beginTransaction().add(CommentFragment.newInstance("",""),"commentFragment").commitAllowingStateLoss()
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}