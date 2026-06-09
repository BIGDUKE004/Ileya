// The Goal: Write a function called generateSlug that converts a blog post title into a clean website URL link.The Rules:Accept a title string as a parameter.Trim any accidental spaces at the edges.Convert the entire title to lowercase.Replace all spaces between words with a dash (-). Hint: Look up .replaceAll().
function generateSlug(BlogPost){
BlogPost = BlogPost.replaceAll('', '-');
return BlogPost

}

module.exports = {generateSlug};
