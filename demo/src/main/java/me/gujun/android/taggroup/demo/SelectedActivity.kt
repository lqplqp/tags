package me.gujun.android.taggroup.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_selected.*
import me.gujun.android.taggroup.TagGroup

class SelectedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected)

        val texts = listOf("播报", "市场分析", "介绍机会", "介绍机会", "贵州茅台", "市场分析", "介绍机会", "原创", "拍摄", "贵州茅台", "逢低买进", "高抛低吸", "看涨", "低吸", "低吸", "看涨", "低吸", "低吸", "低吸", "低吸", "看涨", "低吸", "低吸")

        tag_group.setTags(texts)
        tag_group.setOnTagClickListener { Toast.makeText(this@SelectedActivity, it, Toast.LENGTH_SHORT).show() }

        tag_group_checkable.setMode(TagGroup.Mode.CHECKABLE)
        tag_group_checkable.setTags(texts)
        tag_group_checkable.setOnTagClickListener {
            Toast.makeText(this@SelectedActivity, it, Toast.LENGTH_SHORT).show()
            Log.d("checked-tags->", tag_group_checkable.checkedTags.toString())
            Log.d("checked-tags->", tag_group_checkable.checkedIndexList.toString())
        }

        tag_group_delete.setTags(texts)
        tag_group_delete.setOnTagClickListener { Toast.makeText(this@SelectedActivity, it, Toast.LENGTH_SHORT).show() }


    }
}
