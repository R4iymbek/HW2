import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var usernameEditText: EditText? = null
    private var passwordEditText: EditText? = null
    private var loginButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Найдем ваши компоненты пользовательского интерфейса по их идентификаторам
        usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        loginButton = findViewById<Button>(R.id.loginButton)

        // Установим обработчик нажатия на кнопку "Войти"
        loginButton.setOnClickListener(View.OnClickListener {
            // Получим введенные данные
            val username = usernameEditText.getText().toString()
            val password = passwordEditText.getText().toString()

            // Здесь вы можете добавить логику для проверки введенных данных.
            // Например, сравнивать их с предопределенными значениями.
            if (username == "user" && password == "password") {
                // Вход выполнен успешно
                Toast.makeText(this@MainActivity, "Вход выполнен успешно", Toast.LENGTH_SHORT)
                    .show()
            } else {
                // Ошибка входа
                Toast.makeText(
                    this@MainActivity,
                    "Ошибка входа. Проверьте имя пользователя и пароль.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}