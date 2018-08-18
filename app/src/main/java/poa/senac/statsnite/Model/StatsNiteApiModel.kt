package poa.senac.statsnite.Model


data class StatsNiteApiModel(
    var accountId: String,
    var platformId: String,
    var platformName: String,
    var platformNameLong: String,
    var epicUserHandle: String,
    var stats: Stats,
    var lifeTimeStats: List<LifeTimeStat>,
    var recentMatches: List<RecentMatche>
){

inner class RecentMatche(
    var id: String,
    var accountId: String,
    var playlist: String,
    var kills: String,
    var minutesPlayed: String,
    var top1: String,
    var top5: String,
    var top6: String,
    var top10: String,
    var top12: String,
    var top25: String,
    var matches: String,
    var top3: String,
    var dateCollected: String,
    var score: String,
    var platform: String,
    var trnRating: String,
    var trnRatingChange: String
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
    var valueInt: String,
    var value: String,
    var rank: String,
    var displayvalue: String
)

inner class Top6(
    var label: String,
    var field: String,
    var category: String,
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class Kpg(
    var label: String,
    var field: String,
    var category: String,
    var valueDec: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class ScorePerMatch(
    var label: String,
    var field: String,
    var category: String,
    var valueDec: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class Kd(
    var label: String,
    var field: String,
    var category: String,
    var valueDec: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class TrnRating(
    var label: String,
    var field: String,
    var category: String,
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
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
    var valueInt: String,
    var value: String,
    var rank: String,
    var displayvalue: String
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
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class Top5(
    var label: String,
    var field: String,
    var category: String,
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class Matches(
    var label: String,
    var field: String,
    var category: String,
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class Top1(
    var label: String,
    var field: String,
    var category: String,
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class Kills(
    var label: String,
    var field: String,
    var category: String,
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
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
    var valueDec: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
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
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class Top25(
    var label: String,
    var field: String,
    var category: String,
    var valueInt: String,
    var value: String,
    var rank: String,
    var percentile: String,
    var displayvalue: String
)

inner class LifeTimeStat(
    var key: String,
    var value: String
)}