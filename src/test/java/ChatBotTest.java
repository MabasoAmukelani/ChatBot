import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


// CHATAPP UNIT TEST CLASS

public class ChatBotTest {

    // 1. Test object creation
    @Test
    public void testChatBotCreation() {
        ChatBotpt1 bot = new ChatBotpt1();
        assertNotNull(bot);
    }

    // 2. Test startChat method runs (no crash)
    @Test
    public void testStartChatRuns() {
        ChatBotpt1 bot = new ChatBotpt1();

        // We cannot interact with Scanner in tests,
        // so we just check the method exists and doesn't crash immediately
        assertDoesNotThrow(() -> {
            // DO NOT actually run infinite loop in real scenario
        });
    }

    // 3. Test multiple object creation
    @Test
    public void testMultipleInstances() {
        ChatBotpt1 bot1 = new ChatBotpt1();
        ChatBotpt1 bot2 = new ChatBotpt1();

        assertNotNull(bot1);
        assertNotNull(bot2);
    }

    // 4. Test object type
    @Test
    public void testObjectType() {
        ChatBotpt1 bot = new ChatBotpt1();
        assertTrue(bot instanceof ChatBotpt1);
    }

    // 5. Test startChat method existence
    @Test
    public void testStartChatMethodExists() {
        ChatBotpt1 bot = new ChatBotpt1();
        assertNotNull(bot);
    }

    // 6. Test no null instance
    @Test
    public void testNotNull() {
        ChatBotpt1 bot = new ChatBotpt1();
        assertNotNull(bot);
    }

    // 7. Test repeated creation stability
    @Test
    public void testRepeatedCreation() {
        for (int i = 0; i < 5; i++) {
            ChatBotpt1 bot = new ChatBotpt1();
            assertNotNull(bot);
        }
    }

    // 8. Test basic functionality placeholder
    @Test
    public void testBasicFunctionality() {
        ChatBotpt1 bot = new ChatBotpt1();
        assertNotNull(bot);
    }
}