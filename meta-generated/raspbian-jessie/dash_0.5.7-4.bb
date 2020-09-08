PACKAGES = "${PN} dash"
PROVIDES = "dash"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dash/dash_0.5.7-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_dash = "dash_0.5.7-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "060879766467e63097dc98c989f6c8a92c77572e6e3403927254686e2ce586c5"
SRC_URI[deb0.md5sum] = "2e33fc91e0f194255676a6af5121ca81"

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
