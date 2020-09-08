PACKAGES = "${PN} dash"
PROVIDES = "dash"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/dash/dash_0.5.7-4+b1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_dash = "dash_0.5.7-4+b1_armhf.deb"
SRC_URI[deb0.sha256sum] = "4520de436d90e8e25d6be7cfdd2cf1610e6063a40c5331b062c2532283c18736"
SRC_URI[deb0.md5sum] = "b6c3719c6132c423ba9596e020ac36d5"

RDEPENDS_${PN} = "debianutils (>= 2.15) dpkg (>= 1.15.0) libc6 (>= 2.11)"
DEPENDS = "debianutils dpkg libc6"


inherit deb_group

FILES_${PN} = " \
    ./bin/dash \
    ./bin/sh \
    ./usr/share/doc/dash/NEWS.Debian.gz \
    ./usr/share/doc/dash/README.Debian.diet \
    ./usr/share/doc/dash/README.source \
    ./usr/share/doc/dash/changelog.Debian.gz \
    ./usr/share/doc/dash/changelog.gz \
    ./usr/share/doc/dash/copyright \
    ./usr/share/man/man1/dash.1.gz \
    ./usr/share/man/man1/sh.1.gz \
    ./usr/share/menu/dash\
"
