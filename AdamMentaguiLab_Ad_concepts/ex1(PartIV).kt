package AdamMentaguiLab_Ad_concepts

//creating our sealed class
sealed class ApiResponse{
    //defining our class for the sealed one
    data class Success(val userProfile: String ): ApiResponse()
    //making an inner sealed class
    sealed class Error: ApiResponse() {
        //creating objects so they cant be modified
        data object Unauthorized: Error()
        data object NotFound: Error()
        //this is going to be modified so it is going to be a data class
        data class  ServerError(val Errorcode: Int,val message: String): Error()
    }
}
//this function checks the response and gives the appropriate display
fun handleResponse(response: ApiResponse){
    when(response){
        is ApiResponse.Success -> {"Success! Loading profile: [userProfile data]"}
        is ApiResponse.Error.Unauthorized -> { "ALERT: Unauthorized access attempt detected!"}
        is ApiResponse.Error.NotFound -> { "Error: User profile not found."}
        is ApiResponse.Error.ServerError ->{"Error: Server failed with code [errorCode]:[message]"}
    }
}

fun main(){
    //creating a list that contains responses
    val responses = listOf(
        ApiResponse.Success("{ 'user': 'admin', 'level': 99 }"),
        ApiResponse.Error.Unauthorized,
        ApiResponse.Error.ServerError(503, "Database connection failed")
    )
    //this loop will browse in our list whilist using our function
    for (response in responses) {
        handleResponse(response)
    }

}