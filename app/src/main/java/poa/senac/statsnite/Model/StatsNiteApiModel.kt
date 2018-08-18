package poa.senac.statsnite.Model


data class StatsNiteApiModel(
    val accountId: String,
    val platformId: Int,
    val platformName: String,
    val platformNameLong: String,
    val epicUserHandle: String,
    val stats: Stats,
    val lifeTimeStats: List<LifeTimeStat>,
    val recentMatches: List<RecentMatche>
)

data class RecentMatche(
    val id: Int,
    val accountId: String,
    val playlist: String,
    val kills: Int,
    val minutesPlayed: Int,
    val top1: Int,
    val top5: Int,
    val top6: Int,
    val top10: Int,
    val top12: Int,
    val top25: Int,
    val matches: Int,
    val top3: Int,
    val dateCollected: String,
    val score: Int,
    val platform: Int,
    val trnRating: Double,
    val trnRatingChange: Double
)

data class Stats(
    val p2: P2,
    val p10: P10,
    val p9: P9,
    val curr_p2: CurrP2,
    val curr_p10: CurrP10,
    val curr_p9: CurrP9
)

data class CurrP9(
    val trnRating: TrnRating,
    val score: Score,
    val top1: Top1,
    val top3: Top3,
    val top5: Top5,
    val top6: Top6,
    val top10: Top10,
    val top12: Top12,
    val top25: Top25,
    val kd: Kd,
    val winRatio: WinRatio,
    val matches: Matches,
    val kills: Kills,
    val kpg: Kpg,
    val scorePerMatch: ScorePerMatch
)

data class Top12(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val displayValue: String
)

data class Top6(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Matches(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Kpg(
    val label: String,
    val field: String,
    val category: String,
    val valueDec: Double,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Top5(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val displayValue: String
)

data class Score(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class WinRatio(
    val label: String,
    val field: String,
    val category: String,
    val valueDec: Double,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Top3(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Top25(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val displayValue: String
)

data class Top10(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val displayValue: String
)

data class Kills(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class ScorePerMatch(
    val label: String,
    val field: String,
    val category: String,
    val valueDec: Double,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Kd(
    val label: String,
    val field: String,
    val category: String,
    val valueDec: Double,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class TrnRating(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Top1(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class CurrP2(
    val trnRating: TrnRating,
    val score: Score,
    val top1: Top1,
    val top3: Top3,
    val top5: Top5,
    val top6: Top6,
    val top10: Top10,
    val top12: Top12,
    val top25: Top25,
    val kd: Kd,
    val winRatio: WinRatio,
    val matches: Matches,
    val kills: Kills,
    val kpg: Kpg,
    val scorePerMatch: ScorePerMatch
)

data class WinRatio(
    val label: String,
    val field: String,
    val category: String,
    val valueDec: Int,
    val value: String,
    val rank: Int,
    val displayValue: String
)

data class Top3(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val displayValue: String
)

data class Top6(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val displayValue: String
)

data class Top1(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val displayValue: String
)

data class Top25(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Top10(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class P10(
    val trnRating: TrnRating,
    val score: Score,
    val top1: Top1,
    val top3: Top3,
    val top5: Top5,
    val top6: Top6,
    val top10: Top10,
    val top12: Top12,
    val top25: Top25,
    val kd: Kd,
    val winRatio: WinRatio,
    val matches: Matches,
    val kills: Kills,
    val kpg: Kpg,
    val scorePerMatch: ScorePerMatch
)

data class Score(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class Top5(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class Top12(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class Matches(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class Top1(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class Kills(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class P9(
    val trnRating: TrnRating,
    val score: Score,
    val top1: Top1,
    val top3: Top3,
    val top5: Top5,
    val top6: Top6,
    val top10: Top10,
    val top12: Top12,
    val top25: Top25,
    val kd: Kd,
    val winRatio: WinRatio,
    val matches: Matches,
    val kills: Kills,
    val kpg: Kpg,
    val scorePerMatch: ScorePerMatch
)

data class Top6(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class CurrP10(
    val trnRating: TrnRating,
    val score: Score,
    val top1: Top1,
    val top3: Top3,
    val top5: Top5,
    val top6: Top6,
    val top10: Top10,
    val top12: Top12,
    val top25: Top25,
    val kd: Kd,
    val winRatio: WinRatio,
    val matches: Matches,
    val kills: Kills,
    val kpg: Kpg,
    val scorePerMatch: ScorePerMatch
)

data class WinRatio(
    val label: String,
    val field: String,
    val category: String,
    val valueDec: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class Top5(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Int,
    val displayValue: String
)

data class P2(
    val trnRating: TrnRating,
    val score: Score,
    val top1: Top1,
    val top3: Top3,
    val top5: Top5,
    val top6: Top6,
    val top10: Top10,
    val top12: Top12,
    val top25: Top25,
    val kd: Kd,
    val winRatio: WinRatio,
    val matches: Matches,
    val kills: Kills,
    val kpg: Kpg,
    val scorePerMatch: ScorePerMatch
)

data class Top10(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class Top25(
    val label: String,
    val field: String,
    val category: String,
    val valueInt: Int,
    val value: String,
    val rank: Int,
    val percentile: Double,
    val displayValue: String
)

data class LifeTimeStat(
    val key: String,
    val value: String
)