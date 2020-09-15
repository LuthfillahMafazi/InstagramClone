package cookode.instagram_clone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.squareup.picasso.Picasso
import cookode.instagram_clone.R
import cookode.instagram_clone.model.Post

class PostAdapter (private val mContext: Context, private val mPost: List<Post>)
    : RecyclerView.Adapter<PostAdapter.ViewHolder>(){

    private var firebaseUser : FirebaseUser? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.post_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mPost.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        firebaseUser = FirebaseAuth.getInstance().currentUser

        val post = mPost[position]
//        Picasso.get().load(post.getPostImage()).into(holder.)
    }
    class ViewHolder(view: View) :
    RecyclerView.ViewHolder(view){

    }
}
