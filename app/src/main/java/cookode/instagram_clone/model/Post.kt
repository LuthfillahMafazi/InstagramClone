package cookode.instagram_clone.model

class Post {
    private var postid : String = ""
    private var postimage : String ? = null
    private var publisher : String = ""
    private var description : String = ""


    constructor()
    constructor(postId: String, postImage: String, publisher: String, description: String) {
        this.postid = postId
        this.postimage = postImage
        this.publisher = publisher
        this.description = description
    }
    fun getPostId(): String {
        return postid
    }
    fun getPostImage(): String? {
        return postimage
    }
    fun getPublisher(): String {
        return publisher
    }
    fun getDesc(): String {
        return description
    }
    fun setPostId(postId: String) {
        this.postid = postId
    }
    fun setPostImage(postImage: String) {
        this.postimage = postImage
    }
    fun setPublisher(publisher: String) {
        this.publisher = publisher
    }
    fun setDesc(description: String) {
        this.description = description
    }

}