PACKAGES = "${PN} insserv"
PROVIDES = "insserv"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/i/insserv/insserv_1.18.0-2_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_insserv = "insserv_1.18.0-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "f23c963e97941f9a4c56a3ef473d25ea209924a87ca6f9c34f13dc7d303af7b1"
SRC_URI[deb0.md5sum] = "9f951660b57f46717ac6dc8b66c0c8f1"

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
