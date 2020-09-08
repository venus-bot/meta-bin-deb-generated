PACKAGES = "${PN} daemontools daemontools-run"
PROVIDES = "daemontools daemontools-run"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/daemontools/daemontools_0.76-7_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/daemontools/daemontools-run_0.76-7_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_daemontools = "daemontools_0.76-7_armhf.deb"
SRC_URI[deb0.sha256sum] = "a463cfd7665a7516209b4247da07b241dffbf775935991037ca745f9cc71199c"
SRC_URI[deb0.md5sum] = "ccbc97111ab7f4efa7af0e97d0091789"
DEBFILENAME_daemontools-run = "daemontools-run_0.76-7_all.deb"
SRC_URI[deb1.sha256sum] = "ad1493831b6e243ab02f18fb3521f1bfe91ed957a0d9cab8afe99922905b178c"
SRC_URI[deb1.md5sum] = "2a3a587a362202552e3b804e1e90ec2f"

RDEPENDS_${PN} = "libc6 (>= 2.4)"
RDEPENDS_${PN}-run = "daemontools (>> 1:0.76)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./usr/bin/envdir \
    ./usr/bin/envuidgid \
    ./usr/bin/fghack \
    ./usr/bin/multilog \
    ./usr/bin/pgrphack \
    ./usr/bin/readproctitle \
    ./usr/bin/setlock \
    ./usr/bin/setuidgid \
    ./usr/bin/softlimit \
    ./usr/bin/supervise \
    ./usr/bin/svc \
    ./usr/bin/svok \
    ./usr/bin/svscan \
    ./usr/bin/svscanboot \
    ./usr/bin/svstat \
    ./usr/bin/tai64n \
    ./usr/bin/tai64nlocal \
    ./usr/share/doc/daemontools/NEWS.Debian.gz \
    ./usr/share/doc/daemontools/README.Debian \
    ./usr/share/doc/daemontools/changelog.Debian.gz \
    ./usr/share/doc/daemontools/changelog.gz \
    ./usr/share/doc/daemontools/copyright \
    ./usr/share/man/man8/envdir.8.gz \
    ./usr/share/man/man8/envuidgid.8.gz \
    ./usr/share/man/man8/fghack.8.gz \
    ./usr/share/man/man8/multilog.8.gz \
    ./usr/share/man/man8/pgrphack.8.gz \
    ./usr/share/man/man8/readproctitle.8.gz \
    ./usr/share/man/man8/setlock.8.gz \
    ./usr/share/man/man8/setuidgid.8.gz \
    ./usr/share/man/man8/softlimit.8.gz \
    ./usr/share/man/man8/supervise.8.gz \
    ./usr/share/man/man8/svc.8.gz \
    ./usr/share/man/man8/svok.8.gz \
    ./usr/share/man/man8/svscan.8.gz \
    ./usr/share/man/man8/svscanboot.8.gz \
    ./usr/share/man/man8/svstat.8.gz \
    ./usr/share/man/man8/tai64n.8.gz \
    ./usr/share/man/man8/tai64nlocal.8.gz\
"
FILES_daemontools-run = " \
    ./lib/systemd/system/daemontools.service \
    ./usr/sbin/update-service \
    ./usr/share/daemontools-run/inittab \
    ./usr/share/doc/daemontools-run/README.Debian \
    ./usr/share/doc/daemontools-run/changelog.Debian.gz \
    ./usr/share/doc/daemontools-run/changelog.gz \
    ./usr/share/doc/daemontools-run/copyright \
    ./usr/share/man/man8/update-service.8.gz\
"
