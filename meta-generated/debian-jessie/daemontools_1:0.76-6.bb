PACKAGES = "daemontools daemontools-run"
PROVIDES = "daemontools daemontools-run"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/daemontools/daemontools_0.76-6_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/d/daemontools/daemontools-run_0.76-6_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_daemontools = "daemontools_0.76-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "0220a11476196cc5067f99dd73646f8d95d976e29fb9651e7f1a0c67ed26cd65"
SRC_URI[deb0.md5sum] = "0845a5af9e49036aace2a37a0027a0e0"
DEBFILENAME_daemontools-run = "daemontools-run_0.76-6_all.deb"
SRC_URI[deb1.sha256sum] = "68639d3daadc64d0bb43fcf09cf39fd6ef9979f4604f7359bd89bb6f5def71d8"
SRC_URI[deb1.md5sum] = "7d1bf6718c006741bd8c93a4c8a24970"

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
	./usr/bin/tai64n \
	./usr/share/man/man8/supervise.8.gz \
	./usr/share/man/man8/svscan.8.gz \
	./usr/bin/svok \
	./usr/share/man/man8/multilog.8.gz \
	./usr/bin/multilog \
	./usr/bin/softlimit \
	./usr/share/man/man8/envuidgid.8.gz \
	./usr/share/man/man8/readproctitle.8.gz \
	./usr/bin/tai64nlocal \
	./usr/bin/supervise \
	./usr/share/man/man8/fghack.8.gz \
	./usr/bin/setuidgid \
	./usr/share/man/man8/pgrphack.8.gz \
	./usr/share/man/man8/setuidgid.8.gz \
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
	./usr/bin/readproctitle \
	./usr/share/doc/daemontools/README.Debian \
	./usr/share/man/man8/envdir.8.gz \
	./usr/bin/fghack \
	./usr/share/man/man8/svstat.8.gz \
	./usr/bin/pgrphack \
	./usr/share/man/man8/setlock.8.gz \
	./usr/share/man/man8/svscanboot.8.gz \
	./usr/bin/envdir \
	./usr/share/doc/daemontools/changelog.gz\
"
FILES_daemontools-run = " \
	./usr/share/doc/daemontools-run/changelog.Debian.gz \
	./usr/sbin/update-service \
	./lib/systemd/system/daemontools.service \
	./usr/share/doc/daemontools-run/copyright \
	./usr/share/doc/daemontools-run/changelog.gz \
	./usr/share/doc/daemontools-run/README.Debian \
	./usr/share/daemontools-run/inittab \
	./usr/share/man/man8/update-service.8.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
