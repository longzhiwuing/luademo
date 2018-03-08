---
--- Generated by EmmyLua(https://github.com/EmmyLua)
--- Created by Administrator.
--- DateTime: 2018/3/8 14:19
---

local times = redis.call('incr', KEYS[1])

if times == 1 then
    redis.call('expire', KEYS[1], ARGV[1])
end

if times > tonumber(ARGV[2]) then
    return 0
end

return 1