package pe.warrenth.cleanmvvm.data.datasource

class PostDataStoreFactory(
    private val localDataStore: PostDataSource,
    private val remoteDataStore: PostDataSource
) {

    fun getDataStore(isCached: Boolean): PostDataSource {
        return if (isCached) localDataStore else remoteDataStore
    }

    fun getLocalDataStore(): PostDataSource = localDataStore

    fun getRemoteDataStore(): PostDataSource = remoteDataStore
}