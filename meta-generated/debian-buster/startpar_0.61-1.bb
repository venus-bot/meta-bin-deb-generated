PACKAGES = "${PN} startpar"
PROVIDES = "startpar"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/s/startpar/startpar_0.61-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_startpar = "startpar_0.61-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "1335e44e40b037d64deffe71ee9057c3e0f47f8f77e57208949fd17960052113"
SRC_URI[deb0.md5sum] = "4a604e353af911082af9bb0082efd3aa"

RDEPENDS_${PN} = "libc6 (>= 2.28)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./lib/startpar/startpar \
    ./usr/share/doc/startpar/changelog.Debian.gz \
    ./usr/share/doc/startpar/copyright \
    ./usr/share/man/man8/startpar.8.gz\
"
