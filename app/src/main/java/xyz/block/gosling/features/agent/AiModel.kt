package xyz.block.gosling.features.agent

enum class ModelProvider {
    OPENAI,
    GEMINI
}

data class AiModel(
    val displayName: String,
    val identifier: String,
    val provider: ModelProvider
) {
    companion object {
        val AVAILABLE_MODELS = listOf(
            // ChatAnywhere models
            AiModel("GPT-4o mini", "gpt-4o-mini", ModelProvider.OPENAI),
            AiModel("GPT-4o", "gpt-4o", ModelProvider.OPENAI),
            AiModel("GPT-4.1", "gpt-4.1", ModelProvider.OPENAI),
            AiModel("GPT-4.1 mini", "gpt-4.1-mini", ModelProvider.OPENAI),
            AiModel("GPT-4.1 nano", "gpt-4.1-nano", ModelProvider.OPENAI),
            AiModel("GPT-5 mini", "gpt-5-mini", ModelProvider.OPENAI),
            AiModel("GPT-5 nano", "gpt-5-nano", ModelProvider.OPENAI),
            AiModel("DeepSeek R1", "deepseek-r1", ModelProvider.OPENAI),
            AiModel("DeepSeek V3", "deepseek-v3", ModelProvider.OPENAI),

            // Gemini models
            AiModel("Gemini Flash", "gemini-2.0-flash", ModelProvider.GEMINI),
            AiModel("Gemini Flash Lite", "gemini-2.0-flash-lite", ModelProvider.GEMINI)
        )

        fun fromIdentifier(identifier: String): AiModel {
            return AVAILABLE_MODELS.find { it.identifier == identifier }
                ?: AVAILABLE_MODELS.first()
        }
    }
}
