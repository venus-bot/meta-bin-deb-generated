PACKAGES = "${PN} insserv"
PROVIDES = "insserv"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/i/insserv/insserv_1.14.0-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_insserv = "insserv_1.14.0-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "efb38bb74c358f579525608e174613fd9cf94ed98b0e420e89945a9c5500aeec"
SRC_URI[deb0.md5sum] = "b39989ce1f4c842a73a28b194813f6d0"

RDEPENDS_${PN} = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./etc/bash_completion.d/insserv \
    ./etc/insserv.conf \
    ./sbin/insserv \
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
