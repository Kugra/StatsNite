package poa.senac.statsnite.Model


data class StatsNiteApiModel(
    var accountId: String,
    var platformId: Int,
    var platformName: String,
    var platformNameLong: String,
    var epicUserHandle: String,
    var stats: Stats,
    var lifeTimeStats: List<LifeTimeStat>,
    var recentMatches: List<RecentMatche>
){

inner class RecentMatche(
    var id: Int,
    var accountId: String,
    var playlist: String,
    var kills: Int,
    var minutesPlayed: Int,
    var top1: Int,
    var top5: Int,
    var top6: Int,
    var top10: Int,
    var top12: Int,
    var top25: Int,
    var matches: Int,
    var top3: Int,
    var dateCollected: String,
    var score: Int,
    var platform: Int,
    var trnRating: Double,
    var trnRatingChange: Double
)


inner class Stats(
    var p2: P2,
    var p10: P10,
    var p9: P9,
    var curr_p2: CurrP2,
    var curr_p10: CurrP10,
    var curr_p9: CurrP9
)

inner class CurrP9(
    var trnRating: TrnRating,
    var score: Score,
    var top1: Top1,
    var top3: Top3,
    var top5: Top5,
    var top6: Top6,
    var top10: Top10,
    var top12: Top12,
    var top25: Top25,
    var kd: Kd,
    var winRatio: WinRatio,
    var matches: Matches,
    var kills: Kills,
    var kpg: Kpg,
    var scorePerMatch: ScorePerMatch
)

inner class Top12(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var displayvarue: String
)

inner class Top6(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Int,
    var displayvarue: String
)

inner class Kpg(
    var label: String,
    var field: String,
    var category: String,
    var varueDec: Double,
    var varue: String,
    var rank: Int,
    var percentile: Int,
    var displayvarue: String
)

inner class ScorePerMatch(
    var label: String,
    var field: String,
    var category: String,
    var varueDec: Double,
    var varue: String,
    var rank: Int,
    var percentile: Int,
    var displayvarue: String
)

inner class Kd(
    var label: String,
    var field: String,
    var category: String,
    var varueDec: Double,
    var varue: String,
    var rank: Int,
    var percentile: Int,
    var displayvarue: String
)

inner class TrnRating(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Int,
    var displayvarue: String
)

inner class CurrP2(
    var trnRating: TrnRating,
    var score: Score,
    var top1: Top1,
    var top3: Top3,
    var top5: Top5,
    var top6: Top6,
    var top10: Top10,
    var top12: Top12,
    var top25: Top25,
    var kd: Kd,
    var winRatio: WinRatio,
    var matches: Matches,
    var kills: Kills,
    var kpg: Kpg,
    var scorePerMatch: ScorePerMatch
)

inner class Top3(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var displayvarue: String
)

inner class P10(
    var trnRating: TrnRating,
    var score: Score,
    var top1: Top1,
    var top3: Top3,
    var top5: Top5,
    var top6: Top6,
    var top10: Top10,
    var top12: Top12,
    var top25: Top25,
    var kd: Kd,
    var winRatio: WinRatio,
    var matches: Matches,
    var kills: Kills,
    var kpg: Kpg,
    var scorePerMatch: ScorePerMatch
)

inner class Score(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Double,
    var displayvarue: String
)

inner class Top5(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Double,
    var displayvarue: String
)

inner class Matches(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Double,
    var displayvarue: String
)

inner class Top1(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Double,
    var displayvarue: String
)

inner class Kills(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Double,
    var displayvarue: String
)

inner class P9(
    var trnRating: TrnRating,
    var score: Score,
    var top1: Top1,
    var top3: Top3,
    var top5: Top5,
    var top6: Top6,
    var top10: Top10,
    var top12: Top12,
    var top25: Top25,
    var kd: Kd,
    var winRatio: WinRatio,
    var matches: Matches,
    var kills: Kills,
    var kpg: Kpg,
    var scorePerMatch: ScorePerMatch
)

inner class CurrP10(
    var trnRating: TrnRating,
    var score: Score,
    var top1: Top1,
    var top3: Top3,
    var top5: Top5,
    var top6: Top6,
    var top10: Top10,
    var top12: Top12,
    var top25: Top25,
    var kd: Kd,
    var winRatio: WinRatio,
    var matches: Matches,
    var kills: Kills,
    var kpg: Kpg,
    var scorePerMatch: ScorePerMatch
)

inner class WinRatio(
    var label: String,
    var field: String,
    var category: String,
    var varueDec: Int,
    var varue: String,
    var rank: Int,
    var percentile: Int,
    var displayvarue: String
)


inner class P2(
    var trnRating: TrnRating,
    var score: Score,
    var top1: Top1,
    var top3: Top3,
    var top5: Top5,
    var top6: Top6,
    var top10: Top10,
    var top12: Top12,
    var top25: Top25,
    var kd: Kd,
    var winRatio: WinRatio,
    var matches: Matches,
    var kills: Kills,
    var kpg: Kpg,
    var scorePerMatch: ScorePerMatch
)

inner class Top10(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Double,
    var displayvarue: String
)

inner class Top25(
    var label: String,
    var field: String,
    var category: String,
    var varueInt: Int,
    var varue: String,
    var rank: Int,
    var percentile: Double,
    var displayvarue: String
)

inner class LifeTimeStat(
    var key: String,
    var varue: String
)}