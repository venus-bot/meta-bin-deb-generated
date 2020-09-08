PACKAGES = "${PN} startpar"
PROVIDES = "startpar"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/s/startpar/startpar_0.61-1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_startpar = "startpar_0.61-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "449ebdfb6dfd2a24e1f38607e545c17e9a5bfb4d3ff349e4f4deffc4ab1c9d77"
SRC_URI[deb0.md5sum] = "fc233591aa303aa82e11a41cb9e1c6ae"

RDEPENDS_${PN} = "libc6 (>= 2.15)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./lib/startpar/startpar \
    ./usr/share/doc/startpar/changelog.Debian.gz \
    ./usr/share/doc/startpar/copyright \
    ./usr/share/man/man8/startpar.8.gz\
"
