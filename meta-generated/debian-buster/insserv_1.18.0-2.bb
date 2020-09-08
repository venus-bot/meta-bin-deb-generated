PACKAGES = "${PN} insserv"
PROVIDES = "insserv"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/i/insserv/insserv_1.18.0-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_insserv = "insserv_1.18.0-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "8e3eed78c15031c5952d3f7afd3c019b160e3a286f5358bdb229f1cfde3e0c25"
SRC_URI[deb0.md5sum] = "ffbd79a7a73c8f5dfeab40cb015032b3"

RDEPENDS_${PN} = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./etc/insserv.conf \
    ./sbin/insserv \
    ./usr/share/bash-completion/completions/insserv \
    ./usr/share/doc/insserv/README \
    ./usr/share/doc/insserv/README.Debian \
    ./usr/share/doc/insserv/changelog.Debian.gz \
    ./usr/share/doc/insserv/changelog.gz \
    ./usr/share/doc/insserv/copyright \
    ./usr/share/insserv/check-archive-initd-scripts \
    ./usr/share/insserv/check-initd-order \
    ./usr/share/insserv/make-testsuite \
    ./usr/share/insserv/seq-changes \
    ./usr/share/man/man8/insserv.8.gz\
"
