import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class AppTest {
    @Test
    fun showText() = runComposeUiTest {
        setContent { App() }

        onNodeWithTag(IMAGE_LABEL_TAG).assertDoesNotExist()
        onNodeWithTag(BUTTON_TAG).performClick()
        onNodeWithTag(IMAGE_LABEL_TAG).assertIsDisplayed()
    }
}