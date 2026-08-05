.PHONY: test expect-fail

test:
	mvn -q test

expect-fail:
	@if mvn -q test >/dev/null 2>&1; then echo "unexpected pass"; exit 1; fi
	@echo "expect-fail ok: lexis tests still red"
