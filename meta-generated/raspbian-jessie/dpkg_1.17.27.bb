PACKAGES = "${PN} dpkg"
PROVIDES = "dpkg"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dpkg/dpkg_1.17.27_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_dpkg = "dpkg_1.17.27_armhf.deb"
SRC_URI[deb0.sha256sum] = "5bf4bb6c88f80d06ced43c4aa3baa593af73134faf3c7ab48dbcb3fb60e7ece6"
SRC_URI[deb0.md5sum] = "c4b13e477a6752560797f5eee411e9c6"

RDEPENDS_${PN} = "libbz2-1.0 libc6 (>= 2.11) liblzma5 (>= 5.1.1alpha+20120614) libselinux1 (>= 2.3) tar (>= 1.23) zlib1g (>= 1:1.1.4)"

inherit deb_group

FILES_${PN} = " \
    ./etc/alternatives/README \
    ./etc/cron.daily/dpkg \
    ./etc/dpkg/dpkg.cfg \
    ./etc/logrotate.d/dpkg \
    ./sbin/start-stop-daemon \
    ./usr/bin/dpkg \
    ./usr/bin/dpkg-deb \
    ./usr/bin/dpkg-divert \
    ./usr/bin/dpkg-maintscript-helper \
    ./usr/bin/dpkg-query \
    ./usr/bin/dpkg-split \
    ./usr/bin/dpkg-statoverride \
    ./usr/bin/dpkg-trigger \
    ./usr/bin/update-alternatives \
    ./usr/sbin/dpkg-divert \
    ./usr/sbin/dpkg-statoverride \
    ./usr/sbin/update-alternatives \
    ./usr/share/doc/dpkg/AUTHORS \
    ./usr/share/doc/dpkg/README.feature-removal-schedule.gz \
    ./usr/share/doc/dpkg/THANKS.gz \
    ./usr/share/doc/dpkg/changelog.Debian.gz \
    ./usr/share/doc/dpkg/changelog.gz \
    ./usr/share/doc/dpkg/copyright \
    ./usr/share/doc/dpkg/usertags.gz \
    ./usr/share/dpkg/abitable \
    ./usr/share/dpkg/cputable \
    ./usr/share/dpkg/ostable \
    ./usr/share/dpkg/triplettable \
    ./usr/share/lintian/overrides/dpkg \
    ./usr/share/locale/ast/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/bs/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/ca/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/cs/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/da/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/de/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/dz/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/el/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/eo/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/es/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/et/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/eu/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/fr/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/gl/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/hu/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/id/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/it/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/ja/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/km/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/ko/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/ku/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/lt/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/mr/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/nb/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/ne/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/nl/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/nn/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/pa/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/pl/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/pt/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/ro/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/ru/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/sk/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/sv/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/th/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/tl/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/tr/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/vi/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/dpkg.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/dpkg.mo \
    ./usr/share/man/de/man1/dpkg-deb.1.gz \
    ./usr/share/man/de/man1/dpkg-maintscript-helper.1.gz \
    ./usr/share/man/de/man1/dpkg-query.1.gz \
    ./usr/share/man/de/man1/dpkg-split.1.gz \
    ./usr/share/man/de/man1/dpkg-trigger.1.gz \
    ./usr/share/man/de/man1/dpkg.1.gz \
    ./usr/share/man/de/man5/dpkg.cfg.5.gz \
    ./usr/share/man/de/man8/dpkg-divert.8.gz \
    ./usr/share/man/de/man8/dpkg-statoverride.8.gz \
    ./usr/share/man/de/man8/start-stop-daemon.8.gz \
    ./usr/share/man/de/man8/update-alternatives.8.gz \
    ./usr/share/man/es/man1/dpkg-deb.1.gz \
    ./usr/share/man/es/man1/dpkg-split.1.gz \
    ./usr/share/man/es/man1/dpkg-trigger.1.gz \
    ./usr/share/man/es/man1/dpkg.1.gz \
    ./usr/share/man/es/man5/dpkg.cfg.5.gz \
    ./usr/share/man/es/man8/dpkg-divert.8.gz \
    ./usr/share/man/es/man8/start-stop-daemon.8.gz \
    ./usr/share/man/es/man8/update-alternatives.8.gz \
    ./usr/share/man/fr/man1/dpkg-deb.1.gz \
    ./usr/share/man/fr/man1/dpkg-maintscript-helper.1.gz \
    ./usr/share/man/fr/man1/dpkg-query.1.gz \
    ./usr/share/man/fr/man1/dpkg-split.1.gz \
    ./usr/share/man/fr/man1/dpkg-trigger.1.gz \
    ./usr/share/man/fr/man1/dpkg.1.gz \
    ./usr/share/man/fr/man5/dpkg.cfg.5.gz \
    ./usr/share/man/fr/man8/dpkg-divert.8.gz \
    ./usr/share/man/fr/man8/dpkg-statoverride.8.gz \
    ./usr/share/man/fr/man8/start-stop-daemon.8.gz \
    ./usr/share/man/fr/man8/update-alternatives.8.gz \
    ./usr/share/man/hu/man5/dpkg.cfg.5.gz \
    ./usr/share/man/it/man1/dpkg-deb.1.gz \
    ./usr/share/man/it/man1/dpkg-maintscript-helper.1.gz \
    ./usr/share/man/it/man1/dpkg-query.1.gz \
    ./usr/share/man/it/man1/dpkg-split.1.gz \
    ./usr/share/man/it/man1/dpkg.1.gz \
    ./usr/share/man/it/man5/dpkg.cfg.5.gz \
    ./usr/share/man/it/man8/dpkg-statoverride.8.gz \
    ./usr/share/man/it/man8/start-stop-daemon.8.gz \
    ./usr/share/man/it/man8/update-alternatives.8.gz \
    ./usr/share/man/ja/man1/dpkg-deb.1.gz \
    ./usr/share/man/ja/man1/dpkg-split.1.gz \
    ./usr/share/man/ja/man1/dpkg-trigger.1.gz \
    ./usr/share/man/ja/man1/dpkg.1.gz \
    ./usr/share/man/ja/man5/dpkg.cfg.5.gz \
    ./usr/share/man/ja/man8/dpkg-divert.8.gz \
    ./usr/share/man/ja/man8/start-stop-daemon.8.gz \
    ./usr/share/man/ja/man8/update-alternatives.8.gz \
    ./usr/share/man/man1/dpkg-deb.1.gz \
    ./usr/share/man/man1/dpkg-maintscript-helper.1.gz \
    ./usr/share/man/man1/dpkg-query.1.gz \
    ./usr/share/man/man1/dpkg-split.1.gz \
    ./usr/share/man/man1/dpkg-trigger.1.gz \
    ./usr/share/man/man1/dpkg.1.gz \
    ./usr/share/man/man5/dpkg.cfg.5.gz \
    ./usr/share/man/man8/dpkg-divert.8.gz \
    ./usr/share/man/man8/dpkg-statoverride.8.gz \
    ./usr/share/man/man8/start-stop-daemon.8.gz \
    ./usr/share/man/man8/update-alternatives.8.gz \
    ./usr/share/man/pl/man1/dpkg-deb.1.gz \
    ./usr/share/man/pl/man1/dpkg-split.1.gz \
    ./usr/share/man/pl/man1/dpkg-trigger.1.gz \
    ./usr/share/man/pl/man1/dpkg.1.gz \
    ./usr/share/man/pl/man5/dpkg.cfg.5.gz \
    ./usr/share/man/pl/man8/dpkg-divert.8.gz \
    ./usr/share/man/pl/man8/start-stop-daemon.8.gz \
    ./usr/share/man/pl/man8/update-alternatives.8.gz \
    ./usr/share/man/sv/man1/dpkg-deb.1.gz \
    ./usr/share/man/sv/man1/dpkg-maintscript-helper.1.gz \
    ./usr/share/man/sv/man1/dpkg-query.1.gz \
    ./usr/share/man/sv/man1/dpkg-split.1.gz \
    ./usr/share/man/sv/man1/dpkg-trigger.1.gz \
    ./usr/share/man/sv/man1/dpkg.1.gz \
    ./usr/share/man/sv/man5/dpkg.cfg.5.gz \
    ./usr/share/man/sv/man8/dpkg-divert.8.gz \
    ./usr/share/man/sv/man8/dpkg-statoverride.8.gz \
    ./usr/share/man/sv/man8/start-stop-daemon.8.gz \
    ./usr/share/man/sv/man8/update-alternatives.8.gz\
"
