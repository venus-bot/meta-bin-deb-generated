PACKAGES = "daemontools daemontools-run"
PROVIDES = "daemontools daemontools-run"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/daemontools/daemontools_0.76-3_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/daemontools/daemontools-run_0.76-3_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_daemontools = "daemontools_0.76-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "d4f6232bbbffc2865d2e2e505ed9377f8ddd4d32e26640b19b8a58240310f324"
SRC_URI[deb0.md5sum] = "dbfd4678ed221e3377b9a3418f36da21"
DEBFILENAME_daemontools-run = "daemontools-run_0.76-3_all.deb"
SRC_URI[deb1.sha256sum] = "6b36272b58994a2abdb635621aecce6a67faa5a7e8fc7ca7f954e6f781a59afa"
SRC_URI[deb1.md5sum] = "16c7582cc3777a333d6be40c1cd4121d"

RDEPENDS_${PN} = "libc6 (>= 2.4)"
RDEPENDS_${PN}-run = "daemontools (>> 1:0.76)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/doc/daemontools/NEWS.Debian.gz \
	./usr/bin/svscanboot \
	./usr/bin/supervise \
	./usr/bin/tai64n \
	./usr/share/man/man8/supervise.8.gz \
	./usr/share/man/man8/svscan.8.gz \
	./usr/bin/svok \
	./usr/share/man/man8/multilog.8.gz \
	./usr/bin/multilog \
	./usr/bin/softlimit \
	./usr/share/man/man8/readproctitle.8.gz \
	./usr/bin/tai64nlocal \
	./usr/bin/setuidgid \
	./usr/share/man/man8/fghack.8.gz \
	./usr/share/man/man8/pgrphack.8.gz \
	./usr/share/man/man8/setuidgid.8.gz \
	./usr/bin/readproctitle \
	./usr/share/doc/daemontools/copyright \
	./usr/share/man/man8/svc.8.gz \
	./usr/share/man/man8/tai64n.8.gz \
	./usr/share/man/man8/tai64nlocal.8.gz \
	./usr/bin/setlock \
	./usr/bin/svc \
	./usr/bin/envuidgid \
	./usr/share/man/man8/svok.8.gz \
	./usr/bin/svstat \
	./usr/share/man/man8/softlimit.8.gz \
	./usr/share/doc/daemontools/changelog.Debian.gz \
	./usr/bin/svscan \
	./usr/share/man/man8/envdir.8.gz \
	./usr/share/doc/daemontools/README.Debian \
	./usr/share/man/man8/envuidgid.8.gz \
	./usr/bin/fghack \
	./usr/share/doc/daemontools/changelog.gz \
	./usr/bin/pgrphack \
	./usr/share/man/man8/setlock.8.gz \
	./usr/share/man/man8/svscanboot.8.gz \
	./usr/bin/envdir \
	./usr/share/man/man8/svstat.8.gz\
"
FILES_daemontools-run = " \
	./usr/share/doc/daemontools-run/changelog.Debian.gz \
	./usr/sbin/update-service \
	./usr/share/doc/daemontools-run/copyright \
	./usr/share/doc/daemontools-run/changelog.gz \
	./usr/share/doc/daemontools-run/README.Debian \
	./usr/share/man/man8/update-service.8.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
