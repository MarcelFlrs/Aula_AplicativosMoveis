package br.escdodev.exroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.RoomDatabase
import androidx.room.Upsert

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Text(text = "Exemplo ROOM database")
        }
    }
}

@Entity
data class Afazer(

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val titulo: String,
    val descricao: String,
    val concluido: Boolean = false
)

@Dao
interface AfazerDao{

    //Listar
    @Query("SELECT * FROM Afazer")
    fun listarAfazeres(): List<Afazer>

    //Buscar por Id
    @Query("SELECT * FROM Afazer WHERE id = :id")
    fun buscarAfazerPorId(id:Int): Afazer

    //Gravar
    @Upsert
    fun gravarAfazer(afazer: Afazer)

    //Excluir
    @Delete
    fun excluirAfazer(afazer: Afazer)

}

@Database(entities = [Afazer::class], version = 1)
abstract class afazerDataBase: RoomDatabase(){
    abstract fun afazerDao(): AfazerDao
}
